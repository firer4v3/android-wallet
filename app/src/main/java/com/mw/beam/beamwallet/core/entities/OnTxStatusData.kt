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
package com.mw.beam.beamwallet.core.entities

import com.mw.beam.beamwallet.core.helpers.ChangeAction
import com.mw.beam.beamwallet.core.helpers.prepareForLog

/**
 * Created by vain onnellinen on 10/15/18.
 */
data class OnTxStatusData(val action: ChangeAction, val tx: List<TxDescription>?) {
    override fun toString(): String {
        return "OnTxStatusData(action=$action, tx=${tx?.prepareForLog()})"
    }
}
