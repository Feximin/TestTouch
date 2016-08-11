# View 的事件分发机制

感谢该文章作者[]()http://www.jianshu.com/p/2be492c1df96

本文的测试环境（引用了作者的原图）。下文分别命名为VGA、VGB、ViewC

![](http://upload-images.jianshu.io/upload_images/1371984-8cbcd729711f25ff.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

###描述
- 所有View均有 dispatchTouchEvent 和 onTouchEvent函数
- 只有GroupView 及其子类含有 onInterceptTouchEvent 函数

###结论：
- 由谁来处理Touch事件最终是由dispatchTouchEvent方法来决定的
- ACTION_DOQWN如果没有任何一个View感兴趣的话，后续的事件（ACTION_MOVE ACTION_UP）则不会再传递进来
- 如果一个View的onInterceptTouchEvent返回了true，则后续的事件不会再传递到该方法，也不会传递到其子view的dispatchTouchEvent及onTouchEvent
- 如果一个View的dispatchTouchEvent返回true，表示对这个事件感兴趣

1. 触摸ViewC

    首先由最顶层的VGA 的dispatchTouchEvent方法来分发，在该方法中调用的onInterceptToucheEvent来决定是否需要拦截
    - 如果返回false表示继续向下传递
    
      VGB调用dispatchTouchEvent 和 onInterceptTouchEvent方法
        - onInterceptTouchEvent返回false
          
          调用ViewC的dispatchTouchEvent方法，并且在其中调用mOnTouchListener的onTouch方法（如果有的话），如果没有mOnToucListener或者onTouch返回false，则调用onTouchEvent，onTouchEvent中判断是否需要调用onClick、onLongClick等一系列方法
          - 
        - 返回true
    - 返回true表示拦截
