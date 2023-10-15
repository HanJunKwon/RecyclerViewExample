package com.example

/**
 * 사용자 정보
 */
data class UserInformation (
    val email: String = "",         // 이메일 주소
    val firstName: String = "",     // 성
    val lastName: String = "",      // 이름
    val avatar: String = ""         // 썸네일 URL
)