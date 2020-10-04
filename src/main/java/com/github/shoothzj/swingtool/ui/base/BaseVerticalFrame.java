package com.github.shoothzj.swingtool.ui.base;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;

/**
 * @author hezhangjian
 */
@Slf4j
public abstract class BaseVerticalFrame extends BaseFrame {

    public BaseVerticalFrame() {
        super();
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

}
