package com.example

import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerview.R

/**
 * @param context
 */
class UserListAdapter(private val context: Context) : RecyclerView.Adapter<UserListAdapter.UserItemViewHolder>() {

    /**
     * [RecyclerView]에 표시할 데이터 리스트
     */
    private var userList = arrayListOf<UserInformation>()


    /**
     * viewType 형태의 아이템 뷰를 위한 [ViewHolder] 객체 생성 메소드.
     * [ViewHolder]와 [LayoutInflater]로 생성한 view를 연결까지만하고 데이터를 채우지는 않는다.
     * 데이터가 특정 [ViewHolder]에 바인딩된 상태가 아니기 때문이다.
     * 데이터를 바인딩은 [onBindViewHolder] 메소드에서 한다.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemViewHolder {
        Log.d(">>>", "onCreateViewHolder")

        // View 생성
        val view = LayoutInflater.from(context)
            .inflate(R.layout.layout_user_list_item, parent, false)

        return UserItemViewHolder(view)
    }

    override fun getItemCount() = userList.size

    /**
     * 데이터를 [ViewHolder]에 바인드하는 메소드.
     */
    override fun onBindViewHolder(holder: UserItemViewHolder, position: Int) {
        // position에 해당되는 유저 정보
        val user = userList[position]

        Log.d(">>>", "onBindViewHolder() :: userEmail: ${user.email}")

        // 유저 정보를 아이템 뷰에 표시
        holder.imvAvatar.setImageURI(Uri.parse(user.avatar))
        holder.tvFullName.text = user.firstName + " " + user.lastName
        holder.tvEmail.text = user.email

    }

    fun setData(userList: ArrayList<UserInformation>) {
        this.userList = userList
    }

    /**
     * [UserInformation] 아이템 뷰를 표시할 [ViewHolder] 클래스.
     */
    inner class UserItemViewHolder(itemView: View) : ViewHolder(itemView) {

        val imvAvatar: ImageView = itemView.findViewById(R.id.iv_avatar)
        val tvFullName: TextView = itemView.findViewById(R.id.tv_user_full_name)
        val tvEmail: TextView = itemView.findViewById(R.id.tv_user_email)

    }

}