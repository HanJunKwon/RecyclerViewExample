package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.UserInformation
import com.example.UserListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var rvUserInformation: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUserInformation = findViewById(R.id.rv_user)

        // Adapter 할당
        rvUserInformation.adapter = UserListAdapter(this)

        // LayoutManager 할당
        rvUserInformation.layoutManager = LinearLayoutManager(this)

        // RecyclerView에 표시할 데이터 할당
        (rvUserInformation.adapter as UserListAdapter).setData(userList = createUserList())
    }

    /**
     * 유저 정보 생성
     */
    private fun createUserList() : ArrayList<UserInformation> {
        return arrayListOf<UserInformation>().apply {
            add(UserInformation("george.bluth@reqres.in",
                "George",
                "Bluth",
                "https://reqres.in/img/faces/1-image.jpg"))
            add(UserInformation("janet.weaver@reqres.in",
                "Janet",
                "Lawson",
                "https://reqres.in/img/faces/2-image.jpg"))
            add(UserInformation("emma.wong@reqres.in",
                "Emma",
                "Wong",
                "https://reqres.in/img/faces/3-image.jpg"))
            add(UserInformation("eve.holt@reqres.in",
                "Eve",
                "Holt",
                "https://reqres.in/img/faces/4-image.jpg"))
            add(UserInformation("charles.morris@reqres.in",
                "Charles",
                "Morris",
                "https://reqres.in/img/faces/5-image.jpg"))
            add(UserInformation("tracey.ramos@reqres.in",
                "Tracey",
                "Ramos",
                "https://reqres.in/img/faces/6-image.jpg"))
            add(UserInformation("michael.lawson@reqres.in",
                "Michael",
                "Lawson",
                "https://reqres.in/img/faces/7-image.jpg"))
            add(UserInformation("lindsay.ferguson@reqres.in",
                "Lindsay",
                "Ferguson",
                "https://reqres.in/img/faces/8-image.jpg"))
            add(UserInformation("tobias.funke@reqres.in",
                "Tobias",
                "Funke",
                "https://reqres.in/img/faces/9-image.jpg"))
            add(UserInformation("byron.fields@reqres.in",
                "Byron",
                "Fields",
                "https://reqres.in/img/faces/10-image.jpg"))
            add(UserInformation("george.edwards@reqres.in",
                "George",
                "Edwards",
                "https://reqres.in/img/faces/11-image.jpg"))
            add(UserInformation("rachel.howell@reqres.in",
                "Rachel",
                "Howell",
                "https://reqres.in/img/faces/12-image.jpg"))
        }
    }
}