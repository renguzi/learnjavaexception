/**
 * @Author: Asher Huang
 * @Date: 2019-10-04
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */

/**
 * 自定义异常类，必须继承自Throwable或者Throwable的子类
 * 通过无参构造方法中，调用父类的构造方法，把异常信息传递进去
 */
public class CustomerException extends Exception {
    public CustomerException(){
        super("年龄<18或者>80的时候，需要有亲友陪伴才能入住");
    }
}
