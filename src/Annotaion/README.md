# Java常见注解
## @Override 重写注解
这个注解可以告诉编译器，它下面修饰的方法是重写父类的方法
编译器可以对重写方法进行检查
## Deprecated 过时注解
一个方法被此注解修饰说明此方法已经过时，调用的时候出现横线
## @SuppressWarnings 抑制编译器警告注解
让编译器忽视警告
## @SafeVarargs  Java 7“堆污染”警告
......
## @FunctionalInterface 函数式接口
说明该接口是一个函数式接口
# 元注解 
负责注解其他的注解，即用在自定义注解上的注解(@interface 上)，当我们自定义一些注解时是需要元注解的
##１.　＠Ｔarget 
@Target说明了Annotation所修饰的对象范围：Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）、类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循环变量、catch参数）。
        在Annotation类型的声明中使用了target可更加明晰其修饰的目标。
　　作用：用于描述注解的使用范围(被描述的注解可以用在什么地方)
　　取值(ElementType)有：
　　　　1.CONSTRUCTOR:用于描述构造器
　　　　2.FIELD：给属性进行注解
　　　　3.LOCAL_VARIABLE: 给局部变量进行注解
　　　　4.METHOD: 给方法进行注解
　　　　5.PACKAGE: 给一个包进行注解
　　　　6.PARAMETER:用于描述参数
　　　　7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
## 2. @Retention
@Retention：
　　@Retention定义了该Annotation被保留的时间长短：某些Annotation仅出现在源代码中，而被编译器丢弃；
        而另一些却被编译在class文件中；编译在class文件中的Annotation可能会被虚拟机忽略，
        而另一些在class被装载时将被读取（请注意并不影响class的执行，因为Annotation与class在使用上是被分离的）。
        使用这个meta-Annotation可以对 Annotation的“生命周期“限制。
　　作用：表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
　　取值(RetentionPoicy)有：
　　　　1.SOURCE: 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视
　　　　2.CLASS: 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
　　　　3.RUNTIME: 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。
## 3. @Document 
它的作用是能够将注解中的元素包含到 Javadoc 中去
## 4. @Inherited
@Inherited 元注解是一个标记注解
@Inherited阐述了某个被标注的类型是被继承的。如果一个使用了@Inherited修饰的annotation类型被用于一个class，
则这个annotation将被用于该class的子类
# 注解原理
注解主要是用来java的(反射技术)，类的属性，方法，构造方法、父类、接口等信息；
在运行期实例化对象、调用方法、即使方法或属性是私有的的也可以通过反射的形式调用。