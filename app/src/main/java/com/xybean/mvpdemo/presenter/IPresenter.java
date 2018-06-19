package com.xybean.mvpdemo.presenter;

import com.xybean.mvpdemo.view.IView;

/**
 * Author @xybean on 2018/6/19.
 */
public interface IPresenter {
    void bindView(IView view);

    void unbindView();
}
