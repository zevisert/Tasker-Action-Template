/*
 * Copyright 2013 two forty four a.m. LLC <http://www.twofortyfouram.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * <http://www.apache.org/licenses/LICENSE-2.0>
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.twofortyfouram.locale;

/**
 * Utility class containing constants for the Locale Developer Platform.
 */
/*
 * This class is NOT part of the public API.
 */
/* package */final class Constants
{
    /**
     * Log tag for logcat messages generated by the Locale Developer Platform
     */
    /*
     * This is NOT a public API. Third party apps should NOT use this log tag for their own log messages.
     */
    /* package */static final String LOG_TAG = "LocaleApiLibrary"; //$NON-NLS-1$

    /**
     * String package name for Locale.
     */
    /*
     * This is NOT a public API. Third parties should NOT rely on this being the only package name for Locale.
     */
    /* package */static final String LOCALE_PACKAGE = "com.twofortyfouram.locale"; //$NON-NLS-1$

    /**
     * Private constructor prevents instantiation
     *
     * @throws UnsupportedOperationException because this class cannot be instantiated.
     */
    private Constants()
    {
        throw new UnsupportedOperationException("This class is non-instantiable"); //$NON-NLS-1$
    }
}