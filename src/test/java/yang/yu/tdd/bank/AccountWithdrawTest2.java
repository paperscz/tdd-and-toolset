package yang.yu.tdd.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class AccountWithdrawTest2 {

    @Test
    void shouldSuccess() {

        // 1. 创建被测对象account
        Account account = new Account();

        // 2. 设置被测对象的初始状态并注入协作对象——将账户当前余额设置为10000元
        Transactions transactions = mock(Transactions.class);
        account.setTransactions(transactions);
        account.deposit(10000);

        // 3. 执行测试——从账户中取款2000元
        account.withdraw(2000);

        // 4. 断言测试结果符合预期：账户余额只剩下8000元
        assertThat(account.getBalance()).isEqualTo(8000);
    }

}
