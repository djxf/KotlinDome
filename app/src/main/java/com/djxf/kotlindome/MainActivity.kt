package com.djxf.kotlindome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sayHello(100)
    }

    private fun sayHello(a : Int) {
        val list : List<String> = listOf("Hello1","Hello2","Hello3")
        for (str in list){
            print(str)
        }
    }

    fun createRetrofitRequest() {


        //构建okhttpClient
        val okHttpClient = OkHttpClient.Builder()
            .callTimeout(15000,TimeUnit.MILLISECONDS)
            .build()


        //1 生成retrofit对象，运用了建造者模式。
        val retrofit: Retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("http://api.github.com")
            .build()

        //2 创建网络请求接口的实例
        val githubService: GithubService = retrofit.create(GithubService::class.java)

        //3 获取请求对象
        val call: Call<Repo> = githubService.listRepo("djxf")

        //4 发送请求
        call.enqueue(object : Callback<Repo> {
            override fun onFailure(call: Call<Repo>, t: Throwable) {
                 println("onFailure:${Thread.currentThread().name}")
            }

            override fun onResponse(call: Call<Repo>, response: Response<Repo>) {
                println("onResponse:${Thread.currentThread().name}")
            }

        })
    }

    /**
     * 测试函数
     */
    private fun func1() {

    }

    /**
     * 测试函数
     */
    protected fun func2() {

    }


}