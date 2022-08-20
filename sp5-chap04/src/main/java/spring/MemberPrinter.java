package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.time.format.DateTimeFormatter;

public class MemberPrinter {
    private DateTimeFormatter dateTimeFormatter;

    public MemberPrinter(){
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
    }

    public void print(Member member) {
        if(dateTimeFormatter == null) {
            System.out.printf(
                    "회원정보 : 아이디 = %d, 이메일 = %s, 이름 = %s, 등록일 = %tF\n",
                    member.getId(), member.getEmail(), member.getName(), member.getLocalDateTime());
        }else{
            System.out.printf(
                    "회원정보 : 아이디 = %d, 이메일 = %s, 이름 = %s, 등록일 = %s\n",
                    member.getId(), member.getEmail(),
                    member.getName(),
                    dateTimeFormatter.format(member.getLocalDateTime()));
        }
    }

    @Autowired(required = false /*자동주입 필수 아닌 경우 1*/)
    public void setDateTimeFormatter(/*@Nullable*/ DateTimeFormatter dateTimeFormatter /*자동주입 필수 아닌 경우 2*/){
        this.dateTimeFormatter = dateTimeFormatter;
    }
}
