package co.devhack.todoapp.presentation.presenter;

/**
 * Created by krlosf on 30/11/17.
 */

public interface SignUpContract {

    interface View {
        void goToLoginFragment();

        void goToMainActivity();
    }

    interface UserActionsListener {
        void onSignUp(String fullName, String email, String password);
    }

}
