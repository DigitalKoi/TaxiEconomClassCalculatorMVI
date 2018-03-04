package com.digitalkoi.taxieconomclasscalculatormvi.mvibase

import io.reactivex.Observable

/**
 * @author Taras Zhupnyk (akka DigitalKoi) on 04/03/18.
 */

interface MviViewModel<I : MviIntent, S : MviViewState> {

    fun processIntents(intents: Observable<I>)

    fun states(): Observable<S>
}