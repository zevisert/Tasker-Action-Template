package tld.yourdomain.yourapp.receiver;

/**
 * Created by yourdomain on 2017-01-16.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Locale;

import tld.yourdomain.yourapp.Constants;
import tld.yourdomain.yourapp.bundle.BundleScrubber;
import tld.yourdomain.yourapp.bundle.PluginBundleManager;
import tld.yourdomain.yourapp.ui.EditActivity;

/**
 * This is the "fire" BroadcastReceiver for a Locale Plug-in setting.
 *
 * @see com.twofortyfouram.locale.Intent#ACTION_FIRE_SETTING
 * @see com.twofortyfouram.locale.Intent#EXTRA_BUNDLE
 */
public final class FireReceiver extends BroadcastReceiver
{

    /**
     * @param context {@inheritDoc}.
     * @param intent the incoming {@link com.twofortyfouram.locale.Intent#ACTION_FIRE_SETTING} Intent. This
     *            should contain the {@link com.twofortyfouram.locale.Intent#EXTRA_BUNDLE} that was saved by
     *            {@link EditActivity} and later broadcast by Locale.
     */
    @Override
    public void onReceive(final Context context, final Intent intent)
    {
        /*
         * Always be strict on input parameters! A malicious third-party app could send a malformed Intent.
         */

        if (!com.twofortyfouram.locale.Intent.ACTION_FIRE_SETTING.equals(intent.getAction()))
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.e(Constants.LOG_TAG,
                        String.format(Locale.US, "Received unexpected Intent action %s", intent.getAction())); //$NON-NLS-1$
            }
            return;
        }

        BundleScrubber.scrub(intent);

        final Bundle bundle = intent.getBundleExtra(com.twofortyfouram.locale.Intent.EXTRA_BUNDLE);
        BundleScrubber.scrub(bundle);

        if (PluginBundleManager.isBundleValid(bundle))
        {
            final String message = bundle.getString(PluginBundleManager.BUNDLE_EXTRA_STRING_MESSAGE);
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
    }
}