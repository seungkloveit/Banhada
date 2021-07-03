package com.banhada.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.banhada.MainActivity;
import com.banhada.product.Food;
import com.banhada.shipping.ShippingActivity;
import com.banhada.shipping.ShippingListItem;
import com.example.banhada.R;

public class NormalUser_SignUp extends AppCompatActivity {
    View view;
    TextView textView7, user_name, user_email, user_phone, userAddress;
    EditText name_tv, email_tv, phone_tv,tv_id;
    Button button_address_search, button13, sign_up_see1, sign_up_see2, sign_up_see3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normaluser_signup);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

//        view=findViewById(R.id.view);
//        user_name=findViewById(R.id.user_name);
//        user_phone=findViewById(R.id.user_phone);
//        userAddress=findViewById(R.id.userAddress);
//        name_tv=findViewById(R.id.name_tv);
//        email_tv=findViewById(R.id.email_tv);
//        phone_tv=findViewById(R.id.phone_tv);
//        button_address_search=findViewById(R.id.button_address_search);
        button13 = findViewById(R.id.button13);
        sign_up_see1 = findViewById(R.id.sign_up_see1);
        sign_up_see2 = findViewById(R.id.sign_up_see2);
        sign_up_see3 = findViewById(R.id.sign_up_see3);






//
//        button_address_search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 주소 설정 화면으로 이동 (인텐트)
//            }
//        });
        sign_up_see1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(NormalUser_SignUp.this);
                dialog.setTitle("이용약관 동의");
                dialog.setMessage("제1조 (목적)\n이 약관은 반하다 홈페이지가 제공하는 회원 서비스 (이하 \"서비스\"라 한다)를 이용자가 이용함에 있어, 이용자와 반하다 앱 사이의 권리와 의무 및 책임사항과 기타 필요한 사항을 규정함을 목적으로 합니다." +
                        "\n\n제2조 (서비스의 종류)\n모바일 정보서비스 : 반하다 어플리케이션이 제공하는 정보를 서비스 받는 것을 말합니다." +
                        "\n\n제3조 (회원가입의 성립)\n회원가입은 이용자가 이 약관에 대한 동의와 이용자의 회원가입신청에 대한 반하다앱의 승인에 의하여 성립합니다.\n" +
                        "회원가입에 대한 동의는 이용신청 당시 신청서 상의 이용 약관에\"동의\"를 선택함으로써 약관에 동의하는 것으로 간주됩니다.\n\n제4조 (회원가입신청)\n" +
                        "회원가입신청은 이용자가 서비스의 가입신청 양식에 이용자의 인적 사항에 관한 정보와 서비스 회원가입 의사를 등록하는 방식으로 합니다.\n\n제5조 (회원정보의 변경)\n" +
                        "회원은 서비스내 마이페이지를 통하여 언제든지 자신의 가입 정보를 열람할 수 있습니다.\n" +
                        "회원은 회원가입신청 시 기재한 회원정보가 변경되었을 때에는 수정이 가능하며, 회원이 회원정보를 수정하지 아니하여 발생하는 일체의 문제에 관한 책임은 회원에게 있습니다.\n\n" +
                        "제6조 (게시물의 저작권)\n이용자가 서비스에 접속하여 게시한 게시물의 저작권은 해당 게시물의 저작권자에게 있으며, 의정부시는 법령에 위배되지 않는 범위 내에서 이를 활용할 수 있습니다.\n" +
                        "이용자의 게시물이 타인의 저작권, 프로그램 저작권 등을 침해함으로써 발생하는 민, 형사상의 책임은 전적으로 이용자가 부담하여야 합니다.\n" +
                        "이용자는 서비스를 이용하여 얻은 정보를 가공, 판매하는 행위 등 서비스에 게재된 자료를 상업적으로 사용할 수 없습니다.\n\n제7조 (반하다앱의 서비스에 관한 권리)\n" +
                        "반하다앱이 제공하는 서비스, 그에 필요한 소프트웨어, 이미지, 마크, 로고, 디자인, 서비스명칭, 정보 및 상표 등과 관련된 지적재산권 및 기타권리는 반하다앱에게 있습니다.\n" +
                        "이용자는 반하다앱이 명시적으로 사전에 승인한 경우를 제외하고는 제1항 소정의 각 권리에 대한 전부 또는 일부의 수정, 대여, 대출, 판매, 배포, 제작, 양도, 재 라이선스, 담보권 설정행위, 상업적 이용행위를 할 수 없으며, 제3자로 하여금 이와 같은 행위를 하도록 허락할 수도 없습니다." +
                        "\n\n제8조 (개인정보보호정책)\n반하다앱은 회원가입신청 시 회원이 제공하는 정보를 통하여 회원에 관한 정보를 수집하며, 회원의 가입정보는 본 회원가입의 이행과 본 회원가입상의 서비스 제공을 위한 목적으로 이용됩니다.\n" +
                        "반하다앱은 서비스 제공과 관련하여 취득한 회원의 정보를 본인의 승인 없이 제3자 에게 누설 또는 배포할 수 없으며 상업적 목적으로 사용할 수 없습니다. 다만, 아래 각 호의 경우에는 그러하지 아니합니다.\n" +
                        "\n-관계 법령에 의하여 수사상의 목적으로 관계기관으로부터 요구가 있는 경우\n" +
                        "-방송통신심의위원회의 요청이 있는 경우\n" +
                        "-기타 관계법령에서 정한 절차에 따른 요청이 있는 경우\n\n제9조 (양도금지)\n회원은 서비스의 이용권한, 기타 회원가입상의 지위를 타인에게 양도, 증여할 수 없으며, 이를 담보로 제공할 수 없습니다." +
                        "\n\n제10조 (손해배상)\n무료로 제공되는 서비스와 관련하여 이용자에게 어떠한 손해가 발생하더라도 동 손해가 반하다앱의 고의 또는 중대한 과실에 의하여 발생한 경우를 제외하고는 이에 대하여 책임을 부담하지 아니합니다.");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        sign_up_see2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(NormalUser_SignUp.this);
                dialog.setTitle("개인정보 수집 및 이용동의");
                dialog.setMessage("제1조 개인정보의 처리목적\n개인정보를 다음의 목적을 위해 처리합니다. 처리하고 있는 개인정보는 다음의 목적 이외의 용도로는 이용되지 않으며 이용 목적이 변경되는 경우에는 개인정보 보호법 제18조에 따라 별도의 동의를 받는 등 필요한 조치를 이행할 예정입니다." +
                        "\n\n제2조 개인정보의 처리 및 보유 기간\n법령에 따른 개인정보 보유·이용기간 또는 정보주체로 부터 개인정보를 수집 시에 동의 받은 개인정보 보유·이용기간 내에서 개인정보를 처리·보유합니다." +
                        "\n\n제3조 개인정보의 제3자 제공\n정보주체의 개인정보를 제1조 [개인정보의 처리 목적]에서 명시한 범위 내에서 처리하며, 정보주체의 동의, 법률의 특별한 규정 등 개인정보 보호법 제17조에 해당하는 경우에만 개인정보를 제3자에게 제공합니다." +
                        "\n\n제4조 개인정보처리의 위탁\n원활한 개인정보 업무처리를 위하여 다음과 같이 개인정보 처리업무를 위탁하고 있습니다.위탁계약 체결 시 개인정보보호법 제26조에 따라 위탁 업무 수행목적 외 개인정보 처리금지, 기술적·관리적 보호조치, 재위탁 제한, 수탁자에 대한 관리․감독, 손해배상 등 책임에 관한 사항을 계약서 등 문서에 명시하고, 수탁자가 개인정보를 안전하게 처리하는지를 감독하고 있습니다.\n" +
                        "위탁업무의 내용이나 수탁자가 변경될 경우에는 지체 없이 본 개인정보 처리방침을 통하여 공개하도록 하겠습니다." +
                        "\n\n제5조 개인정보 보호책임자 및 개인정보 보호업무 담당부서\n개인정보 처리에 관한 업무를 총괄해서 책임지고, 개인정보 처리와 관련한 정보주체의 불만처리 및 피해구제 등을 위하여 아래와 같이 개인정보 보호책임자 및 담당부서를 지정하고 있습니다.\n" +
                        "\n" +
                        "개인정보 보호책임자 : 반해영(02-300-2021)\n" +
                        "개인정보보호 담당부서 : 컴퓨터공학과\n" +
                        "연 락 처 : 02)300-2642\n" +
                        "팩스번호 : 02)300-2609\n" +
                        "이 메 일 : banhada@korea.kr\n" +
                        "\n정보주체께서는 의정부시의 서비스(또는 사업)를 이용하시면서 발생한 모든 개인정보보호 관련 문의, 불만처리, 피해구제 등에 관한 사항을 개인정보 보호책임자 및 담당부서로 문의하실 수 있습니다." +
                        "\n\n제6조 개인정보 보호책임자개인정보 자동수집 장치의 설치 운영 및 거부에 관한 사항\n홈페이지 서비스 이용과정에서 자동으로 쿠키 등 생성되어 수집될 수 있습니다.\n" +
                        "\n정보주체께서는 쿠키 설정에 대하여 선택권을 가지고 있으며, 사용하는 웹 브라우저의 옵션을 수정함으로써 모든 쿠키를 허용하거나 쿠키를 저장할 때마다 확인을 거치거나, 모든 쿠키의 저장을 거부할 수 있습니다.\n\n" +
                        "제7조 처리하는 개인정보의 항목\n의정부시의 회원가입, 각종 서비스 제공을 위해 처리하는 개인정보의 항목 및 수집 방법은 다음과 같습니다.\n" +
                        "\n" +
                        "홈페이지 회원가입 및 관리\n" +
                        "필수항목 : 아이디, 비밀번호, 이름, 연락처\n" +
                        "인터넷 서비스 이용과정에서 아래 항목이 자동으로 생성되어 수집될 수 있습니다.\n" +
                        "\n접속로그, 쿠키, 접속IP 정보, 가입경로 등\n" +
                        "개인정보보호법 제32조에 따라 등록·공개하는 개인정보파일의 개인정보 항목은 개인정보파일 목록에 안내하고 있습니다.\n\n제8조 개인정보의 안전성 확보 조치" +
                        "\n개인정보보호법 제29조에 따라 개인정보의 안전성 확보를 위해 다음과 같은 조치를 취하고 있습니다.\n" +
                        "\n" +
                        "관리적 조치 : 내부관리계획 수립·시행, 정기적인 직원 교육, 개인정보 보호조직 구성 및 운영, 유출사고 대응, 수탁자 교육·관리·감독 등\n" +
                        "\n기술적 조치 : 개인정보처리시스템 등의 접근권한 관리, 접근통제 시스템설치, 고유식별정보 등의 암호화, 보안프로그램 설치, 개인정보처리시스템의 접속기록 보관 및 위·변조 방지\n" +
                        "\n물리적 조치 : 전산실, 자료보관실, 영상정보 보관시설 등의 접근 통제, 재해 및 재난 대비 안전조치, 개인정보의 파기 등");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        sign_up_see3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(NormalUser_SignUp.this);
                dialog.setTitle("마케팅 정보 수신동의");
                dialog.setMessage(" 개인정보보호법 제22조 제4항에 의해 선택정보 사항에 대해서는 기재하지 않으셔도 서비스를 이용하실 수 있습니다.\n" +
                        "\n" +
                        "① 마케팅 및 광고에의 활용\n" +
                        "– 신규 기능 개발 및 맞춤 서비스 제공\n" +
                        "– 뉴스레터 발송, 새로운 기능(제품)의 안내\n" +
                        "– 할인 및 쿠폰 등 이벤트 등 광고성 정보 제공\n" +
                        "\n" +
                        "② 반하다 서비스를 운용함에 있어 각종 정보를 서비스 화면, SMS, 이메일 등의 방법으로 회원에게 제공할 수 있으며, 결제안내 등 의무적으로 안내되어야 하는 정보성 내용 및 일부 혜택성 정보는 수신동의 여부와 무관하게 제공합니다.\n" +
                        "\n" +
                        " ");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(NormalUser_SignUp.this, SignUp_Complete.class);
                startActivity(intent2);

//                아이디 중복확인(백엔드연결)
//                String userId=tv_id.getText.toString();
//                if(validate){
//                return;
//                }
//                if(userId.equals("")){
//                        AlertDialog.Builder builder=new AlertDialog.Builder(Activity.this); 이 액티비티는 어디로 가야 할지 ..
//                        dialog=builder.setMessage("아이디(이메일주소)는 빈칸일 수 없습니다").setPositiveButton("확인",null).create();
//                        return;
//            }
//
//               Response.Listener<String> responseListener=new Response.Listener<String>() {
//                  @Override
//                    public void onResponse(String response) {
//                       try {
//                          JSONObject jsonResponse=new JSONObject(response);
//                          boolean success=jsonResponse.getBoolean("success");
//                          AlertDialog.Builder builder=new AlertDialog.Builder(Activity.this);
//
//                          if(success){
//                            dialog=builder.setMessage("사용할 수 있는 아이디입니다.");setPositiveButton("확인",null).create();
//                            dialog.show();
//                            tv_id.setEnabled(false);
//                            valid=true;
//                            validateButton.setText("확인");
//                          }
//                          else{
//                            dialog=builder.setMessage("사용할 수 없는 아이디입니다.").setNegativeButton("확인",null).create();
//                            dialog.show();
//                            }
//                         } catch(JSONException e) {
//                            e.printStackTrace();
//                        }
//                     }
//            };
//           ValidateRequest validateRequest = new ValidateRequest(userId,responseListener);
//           RequestQueue queue = Volley.newRequestQueue(Activity.this);
//           queue.add(validateRequest);

            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
            }

        }


        return true;
    }
}

