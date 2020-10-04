package com.github.shoothzj.swingtool.ui.base;

import com.github.shoothzj.swingtool.ui.FrameStack;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Optional;

/**
 * @author hezhangjian
 */
@Slf4j
public abstract class BaseFrame extends JFrame implements WindowListener {

    public BaseFrame() {
        this.addWindowListener(this);
        this.setSize(800, 600);
        initView();
        addView();
        viewBind();
    }

    protected abstract void initView();

    protected abstract void addView();

    protected abstract void viewBind();

    /**
     * 创建一个Frame之后，需要用户手动调用showFrame
     */
    public void showFrame() {
        this.setVisible(true);
        // invisible previous
        final Optional<BaseFrame> frameOp = FrameStack.peek();
        if (!frameOp.isPresent()) {
            log.info("do nothing");
            return;
        }
        FrameStack.push(this);
    }

    public void close() {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        FrameStack.pop();
        final Optional<BaseFrame> frameOp = FrameStack.peek();
        if (frameOp.isPresent()) {
            frameOp.get().setVisible(true);
            return;
        }
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
