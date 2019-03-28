/*
 * // Copyright 2018 Beam Development
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License");
 * // you may not use this file except in compliance with the License.
 * // You may obtain a copy of the License at
 * //
 * //    http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS,
 * // WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * // See the License for the specific language governing permissions and
 * // limitations under the License.
 */

package com.mw.beam.beamwallet.base_screen

import android.content.Context
import io.reactivex.disposables.Disposable

/**
 * Created by vain onnellinen on 10/1/18.
 */
interface MvpPresenter<V : MvpView> {
    fun onCreate()
    fun onViewCreated()
    fun onStart()
    fun onResume()
    fun onPause()
    fun onStop()
    fun onDestroy()
    fun onClose()
    fun hasStatus(): Boolean = false
    fun hasBackArrow(): Boolean? = false
    fun getSubscriptions(): Array<Disposable>?
    fun initSubscriptions()
    fun tryLockApp()
    fun lockApp()
    fun onUserInteraction(context: Context)
    fun isLockScreenEnabled(): Boolean
}
