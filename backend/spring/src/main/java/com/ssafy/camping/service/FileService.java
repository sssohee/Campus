package com.ssafy.camping.service;

import com.ssafy.camping.entity.FileNotice;
import com.ssafy.camping.entity.FileReview;
import com.ssafy.camping.entity.Notice;
import com.ssafy.camping.entity.Review;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    //파일 확장자 검사
    boolean fileExtensionCheck(MultipartFile[] files) throws Exception;

    //리뷰 파일 저장
    void reviewFileSave(Review review, MultipartFile[] files) throws Exception;
    //리뷰 파일 삭제
    void reviewFileDelete(List<FileReview> files) throws Exception;

    //게시글 파일 저장
    void noticeFileSave(Notice notice, MultipartFile[] files) throws Exception;
    //게시글 파일 삭제
    void noticeFileDelete(List<FileNotice> files) throws Exception;
}
