package com.banhada;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.banhada.mart.MartActivity;
import com.banhada.mypage.MyPage;
import com.banhada.mypage.Notice;
import com.banhada.mypage.delivery;
import com.banhada.mypage.picklist;
import com.banhada.payment.Payment;
import com.banhada.product.Food;
import com.banhada.product.User_Product;
import com.banhada.product.popular_product;
import com.banhada.shipping.ShippingActivity;
import com.example.banhada.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    ViewFlipper vf;
    Button btn_mart_search_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btn_mart_search_main=findViewById(R.id.btn_mart_search_main);
        btn_mart_search_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MartActivity.class);       //마트연결
                startActivity(intent);
            }
        });

        // 뷰플리퍼 관련
        vf = (ViewFlipper) findViewById(R.id.viewFlipper);
        vf.setFlipInterval(3000);   // 일단 3초 지정 나중에 조금 더 길게 수정
        vf.startFlipping();
        vf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vf.getDisplayedChild() == 0) {
                    Intent intent = new Intent(getApplicationContext(), Food.class);       //음식1 >> 디비 구축하면 해당상품 가격 가져와서 여기에서 putExtra로 Food에 보내기!
                    startActivity(intent);
                }
                if (vf.getDisplayedChild() == 1) {
                    Intent intent = new Intent(getApplicationContext(), Food.class);       //음식2
                    startActivity(intent);
                }
                if (vf.getDisplayedChild() == 2) {
                    Intent intent = new Intent(getApplicationContext(), Food.class);       //음식3
                    startActivity(intent);
                }
                if (vf.getDisplayedChild() == 3) {
                    Intent intent = new Intent(getApplicationContext(), Food.class);       //음식4
                    startActivity(intent);
                }
            }
        });


        // 바텀 네비게이션 관련내용
        // 현재는 다른 액티비티를 열기 때문에 따라가지 않는데 다음과 같은 방법을 택해야 할 것 같다.
        // 1. 액티비티가 아닌 프래그먼트를 이용한다.
        // 2. 모든 화면에 바텀 네비게이션을 추가한다.
        // 3. 딱히 다른 화면에서 안써도 된다. = 현상유지
        // 홈으로 이동하기, 검색, 장바구니는 모든 화면에서 사용 가능해야 하는 기능이기 때문에 모든 화면에 바텀 네비게이션을 추가하는게 좋을거 같음 (형찬)
        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bn);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.bn_item1) {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);           // 홈
                    startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.bn_item2) {
                    Intent intent = new Intent(getApplicationContext(), Payment.class);           // 카트 >> 마찬가지로 디비 구축하면 해당상품 가격 가져와서 여기에서 putExtra로 Payment에 보내기!
                    startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.bn_item3) {
                   // Intent intent = new Intent(getApplicationContext(), dlatl.class);           // 검색
                   // startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.bn_item4) {
                    Intent intent = new Intent(getApplicationContext(), MyPage.class);           // 마이페이지
                    startActivity(intent);
                }
                return true;
            }
        });

        //위치설정 버튼
        ImageButton loca_btn = (ImageButton)findViewById(R.id.location_btn);
        loca_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShippingActivity.class);        // 주소설정
                startActivity(intent);
            }
        });

        //메뉴 버튼
        ImageButton menu_btn = (ImageButton) findViewById(R.id.menu_btn);
        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), view);
                getMenuInflater().inflate(R.menu.main_navigationmenu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if (menuItem.getItemId() == R.id.menu_1) {
                            Intent intent = new Intent(getApplicationContext(), Notice.class);       // 공지사항
                            startActivity(intent);
                        } else if (menuItem.getItemId() == R.id.menu_2) {
                            Intent intent = new Intent(getApplicationContext(), delivery.class);       // 주문내역 (배송조회랑 역할비교 후 수정)
                            startActivity(intent);
                        } else if (menuItem.getItemId() == R.id.menu_3) {
                            Intent intent = new Intent(getApplicationContext(), delivery.class);       // 배송조회
                            startActivity(intent);
                        } else {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);       //로그아웃 - 기능 나중에 추가
                            startActivity(intent);
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });


        //탭 버튼들
        Button mtb1 = (Button) findViewById(R.id.main_tab_btn1);
        mtb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), User_Product.class);        // 밀키트 메인
                startActivity(intent);
            }
        });
        Button mtb2 = (Button) findViewById(R.id.main_tab_btn2);
        mtb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), popular_product.class);                // 인기상품 ( 확인필요)
                startActivity(intent);
            }
        });
        Button mtb3 = (Button) findViewById(R.id.main_tab_btn3);
        mtb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), picklist.class);                // 내가 찜한 상품
                startActivity(intent);
            }
        });

        //추천음식 버튼들
        ImageButton rcm_imgBtn1 = (ImageButton)findViewById(R.id.main_rcm_btn1);
        rcm_imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Food.class);            //추천음식1 >> 마찬가지로 디비 구축하면 해당상품 가격 가져와서 여기에서 putExtra로 Food에 보내기!
                startActivity(intent);
            }
        });
        ImageButton rcm_imgBtn2 = (ImageButton)findViewById(R.id.main_rcm_btn2);
        rcm_imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Food.class);            //추천음식2
                startActivity(intent);
            }
        });
        ImageButton rcm_imgBtn3 = (ImageButton)findViewById(R.id.main_rcm_btn3);
        rcm_imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Food.class);            //추천음식3
                startActivity(intent);
            }
        });

        //음식카테고리 버튼들
        ImageButton ctg_imgBtn1 = (ImageButton)findViewById(R.id.main_ctg_btn1);
        ctg_imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), User_Product.class);            //한식
                startActivity(intent);
            }
        });
        ImageButton ctg_imgBtn2 = (ImageButton)findViewById(R.id.main_ctg_btn2);
        ctg_imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), User_Product.class);            //일식
                startActivity(intent);
            }
        });
        ImageButton ctg_imgBtn3 = (ImageButton)findViewById(R.id.main_ctg_btn3);
        ctg_imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), User_Product.class);            //중식
                startActivity(intent);
            }
        });
        ImageButton ctg_imgBtn4 = (ImageButton)findViewById(R.id.main_ctg_btn4);
        ctg_imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), User_Product.class);             //양식
                startActivity(intent);
            }
        });
        ImageButton ctg_imgBtn5 = (ImageButton)findViewById(R.id.main_ctg_btn5);
        ctg_imgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), User_Product.class);            //그외
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }


}
