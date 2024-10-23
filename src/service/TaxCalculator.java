package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class TaxCalculator {

    // 简化的个人所得税计算方法
    @WebMethod
    public double calculatePersonalIncomeTax(double income) {
        // 假设的个人所得税率
        final double taxRate = 0.2;
        // 假设的免税额度
        final double mian = 3500;
        // 计算应纳税所得额
        double taxableIncome = income > mian ? income - mian : 0;
        // 计算税款
        double tax = taxableIncome > 0 ? taxableIncome * taxRate : 0;
        System.out.println("接口被调用啦");
        return tax;
    }
}
