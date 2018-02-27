package xyy.marqueeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

  private MarqueeView marqueeView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    marqueeView = (MarqueeView) findViewById(R.id.marquee_view);
    initMarqueeView();
  }

  private void initMarqueeView(){
    ImageView iv1 = new ImageView(this);
    iv1.setImageResource(R.drawable.pic1);
    marqueeView.addViewInQueue(iv1);
    ImageView iv2 = new ImageView(this);
    iv2.setImageResource(R.drawable.pic2);
    marqueeView.addViewInQueue(iv2);
    ImageView iv3 = new ImageView(this);
    iv3.setImageResource(R.drawable.pic3);
    marqueeView.addViewInQueue(iv3);
    ImageView iv4 = new ImageView(this);
    iv4.setImageResource(R.drawable.pic4);
    marqueeView.addViewInQueue(iv4);
    ImageView iv5 = new ImageView(this);
    iv5.setImageResource(R.drawable.pic5);
    marqueeView.addViewInQueue(iv5);
    ImageView iv6 = new ImageView(this);
    iv6.setImageResource(R.drawable.pic6);
    marqueeView.addViewInQueue(iv6);

    marqueeView.setScrollSpeed(8);
    marqueeView.setScrollDirection(MarqueeView.RIGHT_TO_LEFT);
    marqueeView.setViewMargin(15);
    marqueeView.startScroll();
  }
}
