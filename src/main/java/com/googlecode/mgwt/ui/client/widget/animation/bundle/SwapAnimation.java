package com.googlecode.mgwt.ui.client.widget.animation.bundle;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.googlecode.mgwt.ui.client.widget.animation.Animation;

public class SwapAnimation extends AnimationBase {

  interface Bundle extends ClientBundle {
    @Source({"swap.css"})
    CSS css();
  }

  public interface CSS extends Animation.AnimationCss, CssResource {
    @Override
    String in();

    @Override
    String out();

    @Override
    String reverse();
  }

  private static final Bundle bundle = GWT.create(Bundle.class);

  static {
    bundle.css().ensureInjected();
  }

  public SwapAnimation(boolean reversed) {
    super("mgwt-swap", LocaleInfo.getCurrentLocale().isRTL() ? !reversed : reversed);
  }

  @Override
  public CSS css() {
    return bundle.css();
  }
}