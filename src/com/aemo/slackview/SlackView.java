package com.aemo.slackview;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;
import me.wangyuwei.slackloadingview.SlackLoadingView;

public class SlackView extends AndroidNonvisibleComponent {


  private ComponentContainer container;
  private SlackLoadingView loadingView;
  private float duration = 1000;
  private float LL = 50;

  public SlackView(ComponentContainer container) {
    super(container.$form());
    this.container = container;
  }
  @SimpleProperty
  public void Duration(float d) {
    this.duration = d;
    loadingView.setDuration(duration/100);
  }

  @SimpleProperty
  public void LineLength(float ll){
    this.LL = ll;
    loadingView.setLineLength(LL/100);
  }


  @SimpleFunction
  public void Create(AndroidViewComponent layout){
    loadingView = new SlackLoadingView((Context) container);
    FrameLayout fm = (FrameLayout) layout.getView();
    fm.addView(loadingView);
  }


  @SimpleFunction
  public void Start(){
    loadingView.start();
  }
  @SimpleFunction
  public void Reset(){
    loadingView.reset();
  }


}
