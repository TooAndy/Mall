package top.aniss.mall.controller.portal;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.aniss.mall.common.ServerResponse;
import top.aniss.mall.service.IProductService;
import top.aniss.mall.vo.ProductDetailVo;

/**
 * @author Andre Wei
 * create 2018-07-06 下午5:07
 */
@ResponseBody
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @ResponseBody
    @RequestMapping("detail.do")
    public ServerResponse<ProductDetailVo> detail(Integer productId) {
        return iProductService.getPRoductDetail(productId);
    }

    @ResponseBody
    @RequestMapping("detail.do")
    public ServerResponse<PageInfo> list(@RequestParam(value = "keyword", required = false) String keyword,
                                         @RequestParam(value = "categoryId", required = false) Integer categoryId,
                                         @RequestParam(value = "pageName", defaultValue = "1") int pageName,
                                         @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                         @RequestParam(value = "orderBy", defaultValue = "") String orderBy) {
        return iProductService.getProductByKeywordCategory(keyword, categoryId, pageName, pageSize, orderBy);
    }


}
