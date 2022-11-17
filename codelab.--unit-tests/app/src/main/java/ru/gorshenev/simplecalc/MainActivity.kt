package ru.gorshenev.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val mCalculator: Calculator = Calculator()
    private lateinit var mOperandOneEditText: EditText
    private lateinit var mOperandTwoEditText: EditText
    private lateinit var mResultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the calculator class and all the views
        mResultTextView = findViewById(R.id.operation_result_text_view)
        mOperandOneEditText = findViewById(R.id.operand_one_edit_text)
        mOperandTwoEditText = findViewById(R.id.operand_two_edit_text)

        findViewById<Button>(R.id.operation_add_btn).setOnClickListener { onAdd() }
        findViewById<Button>(R.id.operation_sub_btn).setOnClickListener { onSub() }
        findViewById<Button>(R.id.operation_div_btn).setOnClickListener { onDiv() }
        findViewById<Button>(R.id.operation_mul_btn).setOnClickListener { onMul() }
        findViewById<Button>(R.id.operation_pow_btn).setOnClickListener { onPow() }
    }

    /**
     * OnClick method called when the add Button is pressed.
     */
    private fun onAdd() = compute(Calculator.Operator.ADD)

    /**
     * OnClick method called when the subtract Button is pressed.
     */
    private fun onSub() = compute(Calculator.Operator.SUB)

    /**
     * OnClick method called when the divide Button is pressed.
     */
    private fun onDiv() = try {
        compute(Calculator.Operator.DIV)
    } catch (iae: IllegalArgumentException) {
        Log.e(TAG, "IllegalArgumentException", iae)
        mResultTextView.text = getString(R.string.computationError)
    }

    /**
     * OnClick method called when the multiply Button is pressed.
     */
    private fun onMul() = compute(Calculator.Operator.MUL)

    private fun onPow() = compute(Calculator.Operator.POW)

    private fun compute(operator: Calculator.Operator) {
        val operandOne: Double
        val operandTwo: Double
        try {
            operandOne = getOperand(mOperandOneEditText)
            operandTwo = getOperand(mOperandTwoEditText)
        } catch (nfe: NumberFormatException) {
            Log.e(TAG, "NumberFormatException", nfe)
            mResultTextView.text = getString(R.string.computationError)
            return
        }
        val result: String = when (operator) {
            Calculator.Operator.ADD -> mCalculator.add(operandOne, operandTwo).toString()
            Calculator.Operator.SUB -> mCalculator.sub(operandOne, operandTwo).toString()
            Calculator.Operator.DIV -> mCalculator.div(operandOne, operandTwo).toString()
            Calculator.Operator.MUL -> mCalculator.mul(operandOne, operandTwo).toString()
            Calculator.Operator.POW -> mCalculator.pow(operandOne, operandTwo).toString()
        }
        mResultTextView.text = result
    }

    companion object {
        private const val TAG = "CalculatorActivity"

        /**
         * @return the operand value entered in an EditText as double.
         */
        private fun getOperand(operandEditText: EditText?): Double {
            val operandText = getOperandText(operandEditText)
            return operandText.toDouble()
        }

        /**
         * @return the operand text which was entered in an EditText.
         */
        private fun getOperandText(operandEditText: EditText?): String {
            return operandEditText?.text.toString()
        }
    }
}