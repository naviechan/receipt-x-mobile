package com.receiptx.receiptx.receipt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.receiptx.receiptx.R

// TODO rename to something more meaningful e.g. ReceiptRow
class ReceiptInfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.receipt_info, container, false)
    }
}