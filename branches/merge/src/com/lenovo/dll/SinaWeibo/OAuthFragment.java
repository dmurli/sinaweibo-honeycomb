package com.lenovo.dll.SinaWeibo;

//package weibo4andriod.andriodexamples;

import weibo4andriod.Weibo;
import weibo4andriod.WeiboException;
import weibo4andriod.http.RequestToken;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OAuthFragment extends Fragment {
	
	static final String TAG = "Handler";
	static final int HANDLER_TEST = 1;

	private View mView = null;
	
	Handler h = new Handler(){
		public void handleMessage (Message msg)
		{
			switch(msg.what)
			{
			case HANDLER_TEST:
				Log.d(TAG, "The handler thread id = " + Thread.currentThread().getId() + "\n");
			}
		}
	};
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.login, container, false);
		System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
    	System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
    	Button beginOuathBtn = (Button) mView.findViewById(R.id.Button_Load);
    	

    	beginOuathBtn.setOnClickListener(new Button.OnClickListener()
        {

            //@Override
            public void onClick( View v )
            {
                new myThread().start();
            }
        } );

    	return mView;
	}
	
    class myThread extends Thread
    {
    	public void run()
    	{
    		Message msg = new Message();
    		msg.what = HANDLER_TEST;
    		
        	Weibo weibo = OAuthConstant.getInstance().getWeibo();
        	RequestToken requestToken;
			try {
				requestToken =weibo.getOAuthRequestToken("weibo4andriod://OAuthActivity");
    			Uri uri = Uri.parse(requestToken.getAuthenticationURL()+ "&from=xweibo");
    			OAuthConstant.getInstance().setRequestToken(requestToken);
    			startActivity(new Intent(Intent.ACTION_VIEW, uri));
			} catch (WeiboException e) {
				e.printStackTrace();
			}
    		
    		h.sendMessage(msg);
    		Log.d(TAG, "The worker thread id = " + Thread.currentThread().getId() + "\n");  		
    	}
    }
    
    public void hide()
    {
    	try {
    	    FragmentTransaction ft = getFragmentManager().beginTransaction();
    	    ft.hide(this);
    	    ft.commit();
    	} catch (Exception ex) {
    		Log.e(this.toString(), ex.toString());
    	}
    }
}