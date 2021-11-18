package com.mihailakv.anushenkovfinalsertification

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ShareFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_share, container, false)

        val shareButton: Button = view.findViewById (R.id.share_button)

        val intent = Intent (Intent. ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.app_name))

        val chooser = Intent.createChooser(intent, "Поделиться!")

        shareButton.setOnClickListener {
            startActivity(intent)
        }

    return view
    }
}

