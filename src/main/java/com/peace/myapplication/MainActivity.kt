package com.peace.myapplication

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    private lateinit var mAdapter: NewsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "Top Headlines"

        recycler_view_source.layoutManager =LinearLayoutManager(this)
        getData()

        val generalFragment=findViewById<Button>(R.id.generalFragment)
        generalFragment.setOnClickListener {
            getData()
        }

        val techFragment =findViewById<Button>(R.id.techFragment)
        techFragment.setOnClickListener {
            getData1()
        }

        val sportsFragment=findViewById<Button>(R.id.sportsFragment)
        sportsFragment.setOnClickListener {
            getData2()
        }

        val healthFragment=findViewById<Button>(R.id.healthFragment)
        healthFragment.setOnClickListener {
            getData3()
        }

        val businessFragment=findViewById<Button>(R.id.businessFragment)
        businessFragment.setOnClickListener {

            getData4()

        }

        val politicsFragment=findViewById<Button>(R.id.politicsFragment)
        politicsFragment.setOnClickListener {
            getData5()
        }



        mAdapter = NewsAdapter(this)
        recycler_view_source.adapter=mAdapter


    }
    private fun getData() {

        var url = "https://newsapi.org/v2/top-headlines?country=in&apiKey=72abd87555b541328d0cfefa263f33c5"
        val jsonObjectRequest = object : JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
            val newsJsonArray =it.getJSONArray("articles")
            val newsArray =ArrayList<News>()
            for(i in 0 until newsJsonArray.length())
            {
                val newsJsonObject =newsJsonArray.getJSONObject(i)
                val news= News(
                    newsJsonObject.getString("title"),
                    newsJsonObject.getString("author"),
                    newsJsonObject.getString("url"),
                    newsJsonObject.getString("urlToImage"),
                    newsJsonObject.getString("description")
                )
                newsArray.add(news)
            }
                mAdapter.updateNews(newsArray)
            },
            Response.ErrorListener {

            }
        ) {

            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }

        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


}

    private fun getData1() {
        var url = "https://newsapi.org/v2/top-headlines?country=in&category=technology&apiKey=72abd87555b541328d0cfefa263f33c5"
        val jsonObjectRequest = object : JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
                val newsJsonArray =it.getJSONArray("articles")
                val newsArray =ArrayList<News>()
                for(i in 0 until newsJsonArray.length())
                {
                    val newsJsonObject =newsJsonArray.getJSONObject(i)
                    val news= News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("author"),
                        newsJsonObject.getString("url"),
                        newsJsonObject.getString("urlToImage"),
                        newsJsonObject.getString("description")
                    )
                    newsArray.add(news)
                }
                mAdapter.updateNews(newsArray)
            },
            Response.ErrorListener {

            }
        ) {

            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }

        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


    }

    private fun getData2() {
        var url = "https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=72abd87555b541328d0cfefa263f33c5"
        val jsonObjectRequest = object : JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
                val newsJsonArray =it.getJSONArray("articles")
                val newsArray =ArrayList<News>()
                for(i in 0 until newsJsonArray.length())
                {
                    val newsJsonObject =newsJsonArray.getJSONObject(i)
                    val news= News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("author"),
                        newsJsonObject.getString("url"),
                        newsJsonObject.getString("urlToImage"),
                        newsJsonObject.getString("description")
                    )
                    newsArray.add(news)
                }
                mAdapter.updateNews(newsArray)
            },
            Response.ErrorListener {

            }
        ) {

            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }


        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


    }

    private fun getData3() {
        var url = "https://newsapi.org/v2/top-headlines?country=in&category=health&apiKey=72abd87555b541328d0cfefa263f33c5"
        val jsonObjectRequest = object : JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
                val newsJsonArray =it.getJSONArray("articles")
                val newsArray =ArrayList<News>()
                for(i in 0 until newsJsonArray.length())
                {
                    val newsJsonObject =newsJsonArray.getJSONObject(i)
                    val news= News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("author"),
                        newsJsonObject.getString("url"),
                        newsJsonObject.getString("urlToImage"),
                        newsJsonObject.getString("description")
                    )
                    newsArray.add(news)
                }
                mAdapter.updateNews(newsArray)
            },
            Response.ErrorListener {

            }
        ) {

            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }


        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


    }

    private fun getData4() {
        var url = "https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=72abd87555b541328d0cfefa263f33c5"
        val jsonObjectRequest = object : JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
                val newsJsonArray =it.getJSONArray("articles")
                val newsArray =ArrayList<News>()
                for(i in 0 until newsJsonArray.length())
                {
                    val newsJsonObject =newsJsonArray.getJSONObject(i)
                    val news= News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("author"),
                        newsJsonObject.getString("url"),
                        newsJsonObject.getString("urlToImage"),
                        newsJsonObject.getString("description")
                    )
                    newsArray.add(news)
                }
                mAdapter.updateNews(newsArray)
            },
            Response.ErrorListener {

            }
        ) {

            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


    }
    private fun getData5() {
        var url = "https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=72abd87555b541328d0cfefa263f33c5"
        val jsonObjectRequest = object : JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
                val newsJsonArray =it.getJSONArray("articles")
                val newsArray =ArrayList<News>()
                for(i in 0 until newsJsonArray.length())
                {
                    val newsJsonObject =newsJsonArray.getJSONObject(i)
                    val news= News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("author"),
                        newsJsonObject.getString("url"),
                        newsJsonObject.getString("urlToImage"),
                        newsJsonObject.getString("description")
                    )
                    newsArray.add(news)
                }
                mAdapter.updateNews(newsArray)
            },
            Response.ErrorListener {

            }
        ) {

            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }


        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


    }

    override fun onItemClicked(item: News) {

        val builder= CustomTabsIntent.Builder()
        val customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(item.url));
    }
}