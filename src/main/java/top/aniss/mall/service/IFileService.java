package top.aniss.mall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Andre Wei
 * create 2018-07-06 下午1:54
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
