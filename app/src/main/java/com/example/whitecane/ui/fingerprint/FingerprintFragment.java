package com.example.whitecane.ui.fingerprint;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;
        import androidx.lifecycle.Observer;
        import androidx.lifecycle.ViewModelProviders;

        import com.example.whitecane.R;
        import com.google.android.material.snackbar.Snackbar;

public class FingerprintFragment extends Fragment {

    private FingerprintViewModel fingerprintViewModel;
    private Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fingerprintViewModel =
                ViewModelProviders.of(this).get(FingerprintViewModel.class);

        View root = inflater.inflate(R.layout.fingerprint_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_fingerprint);


        fingerprintViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        button = (Button) root.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return root;
    }


}