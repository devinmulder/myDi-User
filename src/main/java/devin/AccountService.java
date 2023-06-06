package devin;

import me.whiteship.di.Inject;

public class AccountService {

    @Inject
    AccountRepository accountRepository;

    public void join() {
        System.out.println("AccountService.join");
        accountRepository.save();
    }
}
