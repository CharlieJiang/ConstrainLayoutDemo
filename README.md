# ConstrainLayoutDemo
安卓约束布局多种特性使用示例


目前Android的默认布局（以前是相对布局）

说明
  1、只支持Android Studio 2.2以上版本

添加时间
  Android Studio 2.2 新增特性

向下兼容性
  API level 9 +（安卓2.3Gingerbread）

特性



用法
  1、居中（Centering Positioning）
    相对父布局水平居中
      app:layout_constraintLeft_toLeftOf="parent"
      app:layout_contraintRight+_toRightOf="parent"
    相对父布局垂直居中
      app:layout_constraintTop_toTopOf="parent"
      app:layout_constraintBottom_toBottomOf="parent"
  2、对齐
    左对齐
      app_constraintLeft_toLeftOf="parent"
    右对齐
      app_constraintRight_toRightOf="parent"
    顶部对齐
      app_constraintTop_toTopOf="parent"
    底部对齐
      app_constraintBottom_toBottomOf="parent"
  3、权重
    水平空白权重：控件水平居中时有效（配合1使用）
      app_constraintHorizontal_bias="0.3"//左右空白权重比3:7
    垂直空白权重：控件垂直居中时有效（配合2使用）
      app_constraintVertical_bias="0.2"//上下空白权重比2:8
  4、圆形定位（Circular Positioning）
    app_constraintCircle="@id/"//相对的基准控件
    app_constraintCircleAngle="360"//角度（0~360）
    app_constraintCircleRadius="10dp"//半径长度
  5、可见性行为：针对GONE的控件（Visibility Behavior）
    过去：
      gone的控件尺寸为0（通常当作一个点处理）
      依赖gone控件参照定位的属性都会失效
    与其他控件有约束关系：
      gone控件的边距都是0，但不会被忽视
      依赖gone控件约束定位的属性有效
    适用场景
      特别适用于简单的布局动画
  6、尺寸约束（Dimensions Constraints）
    约束控件的宽高范围
      android:minWidth="10dp"//最小宽度
      android:maxWidth="100dp"//最大宽度
      android:minHeight="10dp"//最小高度
      android:maxHeight="100dp"//最大高度
    百分比尺寸
      原尺寸需设置成MATCH_CONSTRAINT(0dp)
      宽度百分比设置(0~1)
        android:layout_width="0dp"
        app:layout_constraintWidth_default="percent"
        app:layout_constraintWidth_percent="0.7"
      高度百分比设置(0~1)
        android:layout_height="0dp"
        app:layout_constraintHeight_default="percent"
        app:layout_constraintHeight_percent="0.7"
  7、链式（Chains）
    特点
      将多个控件分组一起应用指定样式
      指定样式只需在第一个控件中设置即可
      分为水平链和垂直链
    主要链样式
      spread：元素分散对齐
      spread inside：元素两端分散对齐
      packed：元素打包在一起排列，可设置偏移量控制排列位置
    其他链样式
      weighted：在spread样式下的权重样式。当设置空间的尺寸为MATCH_CONSTRAINT，即0dp时，设置了权重的控件会平分剩余空间
  8、GuideLine
    说明：布局辅助线，多用于控制多个控件的相同边距（需要在约束布局中使用）
    属性
      layout_constraintGuide_begin：距左侧或顶部距离
      layout_constraintGuide_end：距右侧或底部距离
      layout_constraintGuide_percent：宽或高占布局的百分比
