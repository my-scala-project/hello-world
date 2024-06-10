package test20240610

/**
 * 上线文抽象
 * 
 *@author jwl
 *@date 2024/6/10
 */
@main def contexttual_abstractions: Unit =
  //定义地址列表
  var addresses: List[Address] = List(
    Address("123 Main St", "Springfield", "IL", "62701"),
    Address("956 Elm St", "Chicago", "IL", "60601"),
    Address("789 Oak St", "Chicago", "IL", "61601")
  )
  /**
   * 先按照城市排序，再按照街道排序
   * using是显示传递上下文参数的标识
   * 不给第二个参数，编译器会自动推断
   */
  addresses.sortBy(address => (address.city, address.street))(using Ordering.Tuple2(Ordering.String,Ordering.String)).foreach(println)

//定义地址类
class Address(val street: String, val city: String, val state: String, val zip: String){
  override def toString: String = s"$street, $city, $state $zip"
}