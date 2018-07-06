package top.aniss.mall.service;

import com.github.pagehelper.PageInfo;
import top.aniss.mall.common.ServerResponse;
import top.aniss.mall.pojo.Product;
import top.aniss.mall.vo.ProductDetailVo;

/**
 * @author Andre Wei
 * create 2018-07-06 上午9:18
 */

public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse getProductList(Integer pageNum, Integer pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, Integer pageNum, Integer pageSize);

    ServerResponse<ProductDetailVo> getPRoductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(
            String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
