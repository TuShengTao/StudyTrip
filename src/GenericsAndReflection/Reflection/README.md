# Java反射
## 通过反射获取Class对象的几种方法
### 一:使用 Class.forName()
```
Class clz = Class.forName("java.lang.String");
```
### 二：使用 类名.class
```
Class clz = Apple.class;
```
### 三：使用 实例获取
```
Apple appleObject = new Apple()
Class clz = appObject.getClass()
```