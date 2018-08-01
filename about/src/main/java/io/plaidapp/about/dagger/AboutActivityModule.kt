/*
 * Copyright 2018 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.plaidapp.about.dagger

import android.app.Activity
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import io.plaidapp.about.ui.AboutActivity
import javax.inject.Singleton

/**
 * Dagger module providing stuff from [AboutActivity].
 */
@Module class AboutActivityModule(private val aboutActivity: AboutActivity) {

    @Provides
    @Singleton
    fun provideContext(): Activity = aboutActivity

    @Provides
    @Singleton
    fun provideResources(): Resources = aboutActivity.resources
}