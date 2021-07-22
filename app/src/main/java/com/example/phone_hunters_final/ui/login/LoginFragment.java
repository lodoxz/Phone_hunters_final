package com.example.phone_hunters_final.ui.login;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.phone_hunters_final.FragmentLogout;
import com.example.phone_hunters_final.Home_page;
import com.example.phone_hunters_final.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginFragment extends Fragment {



    private LoginViewModel loginViewModel;
    private FirebaseAuth mAuth;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       //loginViewModel =
                //new ViewModelProvider(this).get(LoginViewModel.class);
        View root = inflater.inflate(R.layout.fragment_login, container, false);





        return root;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button = getActivity().findViewById(R.id.button_login);
        EditText editMail = getActivity().findViewById(R.id.edit_email);
        EditText editPassword = getActivity().findViewById(R.id.edit_password);
        Button b2 = getActivity().findViewById(R.id.button_logout);
        mAuth=FirebaseAuth.getInstance();

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAuth.getCurrentUser()!=null){
                    mAuth.signOut();
                    Toast.makeText(getActivity(), "logout avvenuto",
                            Toast.LENGTH_LONG).show();
                }
            }
        });







        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= editMail.getText().toString().trim();
                String password = editPassword.getText().toString().trim();
                if(email.isEmpty()){
                    editMail.setError("inserire una mail");
                    editMail.requestFocus();
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    editMail.setError("inserire una mail corretta");
                    editMail.requestFocus();
                    return;
                }

                if(password.isEmpty()){
                    editPassword.setError("inserire una password");
                    editPassword.requestFocus();
                    return;
                }

                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            //NavHostFragment.findNavController(LoginFragment.this).
                                  //  navigate(R.id.navigation_home);

                           // FragmentLogout f = FragmentLogout.newInstance();
                           // FragmentManager fm = getActivity().getSupportFragmentManager();
                            //FragmentTransaction ft = fm.beginTransaction();
                           // ft.replace(R.id.conten,f);
                            //ft.commit();
                            Toast.makeText(getActivity(), "login avvenuto",
                                    Toast.LENGTH_LONG).show();

                        }
                        else{
                            editMail.setError("dati sbagliati");
                            editMail.requestFocus();
                            return;
                        }
                    }
                });
            }
        });
    }

}