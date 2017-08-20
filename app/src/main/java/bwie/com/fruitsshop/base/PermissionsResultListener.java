package bwie.com.fruitsshop.base;

/**
 * 文 件 名: MyApplication
 * 创 建 人: 谢兴张
 * 创建日期: 2017/8/8
 * 邮   箱:
 * 博   客:
 * 修改时间：
 * 修改备注：
 */

public interface PermissionsResultListener {
    void onPermissionGranted();

    void onPermissionDenied();
}
