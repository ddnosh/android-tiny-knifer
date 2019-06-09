# android-tiny-knifer
a tiny android annotation processor like ButterKnife  

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190609103548915.png)

# Solution
1. do not write duplicated code to find a widget like TextView tv = findViewById(R.id.tv);

# Function
1. use Annotation to replace "findViewById";
2. use JavaPoet to generate java files when building;

# Technology
1. APT

# Todo
1. add OnClick;
