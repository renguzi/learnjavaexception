import java.util.Objects;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-05
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class Cat {
    private String name;//名字
    private int month;//年龄
    private String species;//品种

//    构造方法
    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }
//    getter、setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", species='" + species + '\'' +
                '}';
    }

//    这里的equals和hashCode方法重写的目的，是为了保证在CatTest中，不可以添加重复猫
    @Override
    public boolean equals(Object o) {
//       判断对象是否相等，相等则直接返回true，不用再继续比较其属性了
        if (this == o) return true;
//        判断o是否是猫类，不过不是则直接返回false，肯定不相等
        if (!(o instanceof Cat)) return false;
//        继续下来，如果o可以转换为猫类，则把其转换成猫类，并且判断其属性是否和当前属性相同
        Cat cat = (Cat) o;
        return getMonth() == cat.getMonth() &&
                Objects.equals(getName(), cat.getName()) &&
                Objects.equals(getSpecies(), cat.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMonth(), getSpecies());
    }
}
