package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private char [] signs;
    private float [] numbers;
    private char [] brackets;

    private String exe = "";

    private float total = 0;
    private float innerTotal = 0;
    private float brackectsTotal = 0;
    private float formerBrackectsTotal = 0;

    private int arraySize = 0;
    private int numBrackets = 0;
    private int ppStartIndex = 0;
    private int bracketsSize = 0; // brackets Array size
    private int bracketsAmount = 0;
    private int insideBracketsEnd =0;
    private int insideBracketsStart =0;

    private boolean nonZero = false;
    private boolean decimal = false;
    private boolean ppPressed =false;
    private boolean negative = false;
    private boolean inAction = false;
    private boolean isBrackets = false;
    private boolean isZeroEntered = false;
    private boolean isNumberCheckIn =false;
    private boolean firstActionTaken = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView exercise = findViewById(R.id.Exercise);
        TextView answer =  findViewById(R.id.Answer);

        exercise.setText("");
        answer.setText("");
        ButtonsFromXML();

        /*Toast toast = Toast.makeText(getApplicationContext(), String.valueOf(total), Toast.LENGTH_SHORT);
        toast.show();*/

    }

    public void ButtonsFromXML()
    {
        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(this);
        Button brackets = findViewById(R.id.brackets);
        brackets.setOnClickListener(this);
        Button percent = findViewById(R.id.precent);
        percent.setOnClickListener(this);
        Button divide = findViewById(R.id.divede);
        divide.setOnClickListener(this);

        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener(this);
        Button eight = findViewById(R.id.eight);
        eight.setOnClickListener(this);
        Button nine = findViewById(R.id.nine);
        nine.setOnClickListener(this);
        Button multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(this);

        Button four = findViewById(R.id.four);
        four.setOnClickListener(this);
        Button five = findViewById(R.id.five);
        five.setOnClickListener(this);
        Button six = findViewById(R.id.six);
        six.setOnClickListener(this);
        Button minus = findViewById(R.id.minus);
        minus.setOnClickListener(this);

        Button one = findViewById(R.id.one);
        one.setOnClickListener(this);
        Button two = findViewById(R.id.two);
        two.setOnClickListener(this);
        Button three = findViewById(R.id.three);
        three.setOnClickListener(this);
        Button plus = findViewById(R.id.plus);
        plus.setOnClickListener(this);

        Button pp = findViewById(R.id.pp);
        pp.setOnClickListener(this);
        Button zero = findViewById(R.id.zero);
        zero.setOnClickListener(this);
        Button dot = findViewById(R.id.dot);
        dot.setOnClickListener(this);
        Button equal = findViewById(R.id.equal);
        equal.setOnClickListener(this);

        ImageButton deleteIcon = findViewById(R.id.deleteIcon);
        deleteIcon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        TextView exercise = findViewById(R.id.Exercise);
        TextView answer = findViewById(R.id.Answer);

        switch (v.getId()) {

            case  R.id.one: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }
                if(!isZeroEntered) {
                    exe += 1;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '1' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }

                nonZero = true;
                break;
            }

            case  R.id.two: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 2;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '2' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }

                nonZero = true;
                break;
            }

            case  R.id.three: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 3;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '3' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }

                nonZero = true;
                break;
            }

            case  R.id.four: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 4;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '4' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }

                nonZero = true;
                break;
            }
            case  R.id.five: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 5;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '5' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }

                nonZero = true;
                break;
            }
            case  R.id.six: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 6;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '6' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }

                nonZero = true;
                break;
            }
            case  R.id.seven: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 7;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '7' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }

                nonZero = true;
                break;
            }
            case  R.id.eight: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 8;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '8' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }
                nonZero = true;
                break;
            }
            case  R.id.nine: {

                if(isBrackets && !ppPressed)
                {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction=true;
                    isBrackets = false;
                }

                if(!isZeroEntered) {
                    exe += 9;
                    exercise.setText(exe);
                    isNumberCheckIn = true;
                    inAction = false;
                    isZeroEntered = false;
                }
                else {
                    exe = '9' + exe.substring(1, exe.length());
                    exercise.setText(exe.toString());
                    isZeroEntered = false;
                }
                nonZero = true;
                break;
            }
            case  R.id.zero: {

                if(!exe.equals("0")) {
                    if(isBrackets && !ppPressed)
                    {
                        exe += 'x';
                        exercise.setText(exe);
                        inAction=true;
                        isBrackets = false;
                    }

                    if(!isZeroEntered) {
                        exe += 0;
                        exercise.setText(exe);
                        isNumberCheckIn = true;
                        if(!nonZero)
                            isZeroEntered = true;
                        inAction = false;
                    }
                }
                break;
            }

            case  R.id.plus: {

                if(!inAction && !exe.equals("")){
                    exe+='+';
                    exercise.setText(exe);
                    inAction =true;
                    isBrackets =false;

                }

                else if(inAction && (exe.endsWith("x")||exe.endsWith("-")||exe.endsWith("/")))
                {
                    if(exe.length()-1>0 && !exe.endsWith("-")) {
                        exe = exe.substring(0, exe.length() - 1) + '+';
                        exercise.setText(exe);
                    }
                    if(exe.length()-1==0 && exe.endsWith("-")) {
                        exe = exe.substring(0, exe.length() - 1);
                        exercise.setText(exe);
                    }
                }
                isZeroEntered = false;
                break;

            }

            case  R.id.minus: {
                if(!inAction) {
                    exe += '-';
                    exercise.setText(exe);
                    inAction =true;
                    isBrackets =false;
                }

                else if(inAction && (exe.endsWith("+")||exe.endsWith("x")||exe.endsWith("/")))
                {
                        exe = exe.substring(0, exe.length() - 1) + '-';
                        exercise.setText(exe);
                }

                isZeroEntered = false;
                break;
            }

            case  R.id.multiply: {
                if(!inAction && !exe.equals("")) {
                    exe += 'x';
                    exercise.setText(exe);
                    inAction =true;
                    isBrackets =false;

                }

                else if(inAction && (exe.endsWith("+")||exe.endsWith("-")||exe.endsWith("/")))
                {
                    if(exe.length()-1>0 && !exe.endsWith("-")) {
                        exe = exe.substring(0, exe.length() - 1) + 'x';
                        exercise.setText(exe);
                    }
                }
                isZeroEntered = false;
                break;
            }

            case  R.id.divede: {
                if(!inAction && !exe.equals("")) {
                    exe += '/';
                    exercise.setText(exe);
                    inAction =true;
                    isBrackets =false;

                }

                else if(inAction && (exe.endsWith("+")||exe.endsWith("-")||exe.endsWith("x")))
                {
                    if(exe.length()-1>0 && !exe.endsWith("-")) {
                        exe = exe.substring(0, exe.length() - 1) + '/';
                        exercise.setText(exe);
                    }
                }

                isZeroEntered = false;
                break;
            }

            case  R.id.precent: {
                if(!inAction && !exe.equals("")) {
                    exe += '%';
                    exercise.setText(exe);
                    inAction =true;
                    isBrackets =false;

                }
                isZeroEntered = false;
                break;
            }

            case  R.id.dot: {
                if(!inAction && !exe.equals("")) {
                    exe += '.';
                    exercise.setText(exe);
                    inAction =true;
                    isZeroEntered =false;
                }
                nonZero=true;
                isZeroEntered = false;
                break;
            }

            case  R.id.clear: {

                exe ="";
                exercise.setText("");
                answer.setText("");
                Reset();

                break;
            }

            case  R.id.equal: {

                PrepareArrays();
                if((bracketsSize - arraySize - 1)%2==0)
                    Reset();

                break;
            }

            case  R.id.pp: {

                boolean firstnumber=false;

                if(!ppPressed) {

                    ppStartIndex = exe.length()-1;
                    if(ppStartIndex != -1) {

                        while (ppStartIndex > 0 && (exe.charAt(ppStartIndex) != '-' && exe.charAt(ppStartIndex) != '+'
                                && exe.charAt(ppStartIndex) != '/' && exe.charAt(ppStartIndex) != 'x') && exe.charAt(ppStartIndex) != '(')
                            ppStartIndex--;

                        if (ppStartIndex == 0)
                            firstnumber = true;

                        if (firstnumber)
                            exe = "(-" + exe;
                        else {
                            exe = exe.substring(0, (ppStartIndex + 1)) + "(-" + exe.substring((ppStartIndex + 1), exe.length());
                            //inAction = true;
                        }
                    }
                    else
                        exe = "(-";

                    exercise.setText(exe.toString());
                    isNumberCheckIn = true;
                    isBrackets = true;
                    ppPressed = true;
                    numBrackets ++;

                }

                else if(ppPressed)
                    {
                        if(ppStartIndex == -1)
                            exe ="";
                        else if(ppStartIndex == 0)
                                exe =  exe.substring(2, exe.length());
                            else
                                exe = exe.substring(0, (ppStartIndex+1)) + exe.substring((ppStartIndex+3),exe.length());

                       exercise.setText(exe.toString());
                       isBrackets = false;
                       ppPressed =false;
                       inAction = false;

                    }

                break;
            }

            case  R.id.brackets: {

                if(isNumberCheckIn && numBrackets>0)
                {
                    exe += ')';
                    exercise.setText(exe);
                    numBrackets--;
                    if(numBrackets==0 || ppPressed) {
                        isNumberCheckIn = false;
                        ppStartIndex = 0;
                    }
                    isBrackets = true;
                }

                else if(!isNumberCheckIn || !isBrackets)
                {
                    if(!inAction && (!exe.equals("")))
                    {
                        exe += 'x';
                        exercise.setText(exe);
                        inAction=true;
                    }

                    exe += '(';
                    exercise.setText(exe);
                    numBrackets++;
                    inAction=true;
                    isBrackets = false;
                }
                isZeroEntered=false;
                break;
            }

            case  R.id.deleteIcon: {

                if(exe.length() != 0)
                {
                    if(exe.endsWith("+") || exe.endsWith("-") || exe.endsWith("x") ||exe.endsWith("/"))
                    {
                        inAction = false;
                        //isBrackets = false;
                    }
                    exe =  exe.substring(0, exe.length()-1);
                    exercise.setText(exe);
                }

                break;
            }

        }}

    private void Reset()
    {

        for(int i = 0; i < arraySize; i++)
        {
            signs[i] = 'z';
            numbers[i]=0;
        }

        if(bracketsSize != 0)
            for(int i = 0; i < bracketsSize; i++)
                brackets[i] = 'z';

        total = 0;
        innerTotal = 0;
        arraySize = 0;
        numBrackets = 0;
        bracketsSize = 0;
        ppStartIndex =0;

        nonZero = false;
        decimal = false;
        inAction = false;
        negative = false;
        isBrackets = false;
        isZeroEntered =false;
        isNumberCheckIn = false;
        firstActionTaken = false;

    }

    public void PrepareArrays()
    {
        arraySize = 0;
        bracketsSize = 0;

        for (int i = 0; i < exe.length(); i++)
        {
            if (exe.charAt(i) == '+' || exe.charAt(i) == '-' || exe.charAt(i) == 'x' || exe.charAt(i) == '/')
                arraySize++;
            if(exe.charAt(i) == '-' && i-1 >= 0 && exe.charAt(i-1) == '(')
                arraySize--;

            else if (exe.charAt(i) == '(' || exe.charAt(i) == ')')
                bracketsSize ++;
        }

        signs = new char[arraySize];
        numbers = new float[arraySize + 1];

        if (bracketsSize != 0)
        {
            bracketsSize += (arraySize+1);
            brackets = new char[bracketsSize];
        }

        //if((bracketsSize - arraySize)%2==0)
             ExerciseToArrays();

       // else
         //   Toast.makeText(MainActivity.this, "Please end the exercise!", Toast.LENGTH_LONG).show();


    }

    public void ExerciseToArrays()
    {
        int iSign = 0;
        int iNumber = 0;
        int iBrackets = 0;
        float iDecimal = (float) 0.1;

        for (int i = 0; i < exe.length(); i++)
        {
            if(exe.charAt(i) >= '0' && exe.charAt(i) <= '9')
            {
                if(decimal)
                {
                    numbers[iNumber] += (iDecimal * Character.getNumericValue(exe.charAt(i)));
                    iDecimal *= 0.1;
                }
                else
                    {
                    numbers[iNumber] *= 10;
                    numbers[iNumber] += Character.getNumericValue(exe.charAt(i));
                    }

                if(bracketsSize != 0)
                {
                    brackets[iBrackets] = 'n';
                    iBrackets++;
                }
            }

            // add a boolean to know when '-' entered
            else if(exe.charAt(i) == '+' || exe.charAt(i) == '-' || exe.charAt(i) == 'x' || exe.charAt(i) == '/')
            {
                if(negative)
                    numbers[iNumber] *=-1;
                if(exe.charAt(i) == '-' && i-1 >=0 && exe.charAt(i-1) != '(')
                    iNumber++;
                else if(exe.charAt(i) != '-' && i-1 >=0 && exe.charAt(i-1) != '('){
                    iNumber++;

                signs[iSign] = exe.charAt(i);
                iSign++;
                }

                negative=false;
                decimal =false;

                if(exe.charAt(i) == '-')
                   negative=true;

            }

            else if(exe.charAt(i) == '.')
                decimal = true;

            if ((exe.charAt(i) == '(' || exe.charAt(i) == ')') && bracketsSize != 0)
            {
                brackets[iBrackets] = exe.charAt(i);
                iBrackets++;
            }

        }

        if(negative)
            numbers[iNumber] *=-1;


        if(bracketsSize != 0)
        {
            boolean IsDone = false;
            boolean AllZ = false;

            while (!IsDone)
            {
                BracketsCalculation();

                IsDone = true;

                for (int i = 0; i < brackets.length-1; i++)
                    if (brackets[i] == '(' || brackets[i] == ')')
                        IsDone = false;


            }
        }

        boolean allDone= true;
        int saveI = 0;
        for(int i=0; i< signs.length-1;i++)
            if(signs[i] != 'z') {
                allDone = false;
                saveI = i;
            }
        if(!allDone){
            total = Operations(formerBrackectsTotal,brackectsTotal,signs[saveI]);
            signs[saveI] = 'z';
        }

        SplitAndSummarize(0,arraySize);
        FinallySummarize(0,arraySize);
    }

    public void RemoveElementFromArrays(int bracketStart)
    {
        /*if (bracketStart != 0)
        {
            int signStart = bracketStart;
            int numberStart = bracketStart;

            char [] newSigns = new char[signs.length-1];
            System.arraycopy(signs,0,newSigns,0,signStart);
            System.arraycopy(signs,signStart+1,newSigns,signStart,signs.length-signStart-1);
            signs = newSigns.clone();
                if(signStart != signs.length) {
                signStart++;
                System.arraycopy(signs, 0, newSigns, 0, signStart);
                System.arraycopy(signs, signStart + 1, newSigns, signStart, signs.length - signStart - 1);

            }

            float [] newNumbers = new float[numbers.length-1];
            System.arraycopy(numbers,0,newNumbers,0,numberStart);
            System.arraycopy(numbers,numberStart+1,newNumbers,numberStart,numbers.length-numberStart-1);
            numbers = newNumbers.clone();
        }*/

        // remove the ( && ) element from brackets[]
        char [] newBrackets = new char[brackets.length-2];
        System.arraycopy(brackets,0,newBrackets,0,bracketStart);
        System.arraycopy(brackets,bracketStart+1,newBrackets,bracketStart,brackets.length);
        brackets = newBrackets.clone();
        /*bracketStart++;
        System.arraycopy(brackets,0,newBrackets,0,bracketStart);
        System.arraycopy(brackets,bracketStart+1,newBrackets,bracketStart,brackets.length-bracketStart-1);
        brackets = newBrackets.clone();*/

    }

    public void BracketsCalculation()
    {
        int i=0;
        bracketsAmount = -1;
        int bracketsEnd = 0;
        int bracketsStart = 0;
        boolean during = false;
        formerBrackectsTotal = brackectsTotal;
        brackectsTotal =0;

        // search on Brackets[] the inner brackets the start & end
        while (i != bracketsSize)
        {
            if(brackets[i] == '(' && bracketsEnd == 0)
            {
                bracketsStart = i;
                bracketsAmount ++;
            }

            if(brackets[i] == ')' && bracketsEnd == 0)
                bracketsEnd = i;

            i++;
        }

        if((bracketsEnd - bracketsStart) == 2) {
            /* RemoveElementFromArrays(bracketsStart);*/
            brackets[bracketsEnd] = 'z';
            brackets[bracketsStart]= 'z';
            SplitAndSummarize(0, numbers.length-1);
        }

        else if(bracketsStart !=0 && bracketsEnd != bracketsSize-1)
            {

                int n = 0;
                for (i = bracketsStart; i <= bracketsEnd; i++)
                    if (brackets[i] == 'n')
                        n++;

                brackets[bracketsEnd] = 'z';
                int save = bracketsEnd;
                bracketsEnd = bracketsStart + n;
                bracketsStart = save - n;
                n = 0;

                for (i = 0; i <= bracketsStart; i++)
                    if (brackets[i] == '(')
                        n++;

                brackets[bracketsStart - 1] = 'z';
                insideBracketsStart = bracketsStart - n;
                insideBracketsEnd = bracketsEnd - n;

                SplitAndSummarize((bracketsStart - n), (bracketsEnd - n));
            }

            else
                if(bracketsEnd > numbers.length)
                 {
                     int n=0;
                     for (i = bracketsStart; i <= bracketsEnd; i++)
                         if (brackets[i] == 'n')
                             n++;
                     insideBracketsStart = numbers.length-n;
                     insideBracketsEnd = numbers.length - 1;

                     /*insideBracketsStart = numbers.length-n-1;
                     insideBracketsEnd = signs.length;*/

                     SplitAndSummarize(insideBracketsStart, (insideBracketsEnd));

                     brackets[bracketsStart] = 'z';
                     brackets[bracketsEnd] = 'z';
                }
                else
                    if(bracketsStart != bracketsEnd)
                    {
                       int  n=0;
                        for (i = 0; i < bracketsEnd; i++)
                            if (brackets[i] == 'n')
                                n++;

                        brackets[bracketsStart] = 'z';
                        brackets[bracketsEnd] = 'z';

                        insideBracketsStart = bracketsStart;
                        insideBracketsEnd = ((bracketsStart + n)-1);

                        SplitAndSummarize((bracketsStart), (bracketsStart + n)-1);
                    }
                    else
                        FinallySummarize(0,arraySize);
    }

    private void SplitAndSummarize(int start, int end)
    {
        // start & end are represent the start and the end of Numbers []
        // the for run from the start number to the end on Signs[]


        for (int i = start; i < end; i++)
        {
            if ((signs[i] == 'x' || signs[i] == '/') && !firstActionTaken)
            {
                total += Operations(numbers[i], numbers[i + 1], signs[i]);
                brackectsTotal += Operations(numbers[i], numbers[i + 1], signs[i]);
                numbers[i]=0;
                numbers[i + 1]=0;
                signs[i] = 'z';
                firstActionTaken = true;
            }

            else if ((signs[i] == 'x' || signs[i] == '/') && firstActionTaken && signs[i] != 'z')
            {
                if(i > insideBracketsStart )
                {
                    total = Operations(total, numbers[i + 1], signs[i]);
                    brackectsTotal = Operations(total, numbers[i + 1], signs[i]);
                    numbers[i + 1] = 0;
                }
                else
                {
                    total = Operations(total, numbers[i], signs[i]);
                    brackectsTotal = Operations(total, numbers[i], signs[i]);
                    numbers[i] = 0;
                }
                signs[i] = 'z';

            }

        }
        FinallySummarize(start,end);
    }

    public float Operations(float number1, float number2, char sign)
    {

        switch (sign)
        {
            case '/':
            {
                innerTotal = (number1 / number2);
                break;
            }

            case 'x':
            {
                innerTotal = (number1 * number2);
                break;
            }

            case '+':
            {
                innerTotal = (number1 + number2);
                break;
            }

            case '-':
            {
                innerTotal = (number1 - number2);
                break;
            }

        }
        return innerTotal;

    }

    private void FinallySummarize(int start,int end)
    {
        TextView answer = findViewById(R.id.Answer);

        for (int i = start; i< end; i++)
        {
            total += numbers[i];
            brackectsTotal += numbers[i];
            signs[i] = 'z';
            numbers[i] = 0;
            firstActionTaken = true;
        }

        total += numbers[end];
        brackectsTotal += numbers[end];
        numbers[end] = 0;



        if(total % 1 == 0)
            answer.setText(String.valueOf((int)total));
        else
            answer.setText(String.valueOf(total));
    }


}