package top.aniss.mall.service;

import top.aniss.mall.common.ServerResponse;
import top.aniss.mall.pojo.Category;

import java.util.List;

/**
 * @author Andre Wei
 * create 2018-07-05 下午8:58
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
