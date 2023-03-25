package come.basim.realproject.data.di

import come.basim.realproject.data.api.ProjectApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object NetworkModule {

    private const val  baseUrl ="https://786b905e-735c-4be6-adfb-949d5dadee32.mock.pstmn.io/"

    @Provides
    @Singleton
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideApi(retrofit: Retrofit):ProjectApi{
        return retrofit.create(ProjectApi::class.java)
    }



}