#**Android中自定义LayoutInflater.Factory实现全局替换系统控件**

Android中自定义LayoutInflater.Factory实现全局替换系统控件（比如TextView,EditText等）
我们有时会遇到这么一个需求，就是要把全局的TextView 、 EditText 替换为自定义的TextView、EditText（比如自定义字体、或者自定义emoji表情时）。如果手动一个个去替换，那不累死了。那有没有一个方法可以全局替换呢？其实安卓系统已经给我们提供了这么一个方法，只需几行代码就能做到。

我的博文地址：http://blog.csdn.net/wei1583812/article/details/74839459