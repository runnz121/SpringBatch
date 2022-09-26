package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
public class PostData {

    //db 번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //row num
    @Column
    private Long rowNumber;

    //개방서비스ID
    @Column
    private String openServiceId;

    //추후 enum
    //개방자치단체코드
    @Column
    private String code;

    //추후 enum
    //관리번호
    @Column
    private String controlNum;

    //업소명
    @Column
    private String shopName;

    //인허가번호
    @Column
    private String allowNumber;

    //도로명주소
    @Column
    private String streetAddress;

    //소재지주소
    @Column
    private String locationAddress;

    //추후 enum
    //영업상태구분코드
    @Column
    private String operationCode;

    //영업상태명
    //추후 enum
    @Column
    private String operationStatus;

    //폐업일자
    @Column
    private String closedDate;

    //폐업일자
    @Column
    private String regDate;

    //신청일자
    @Column
    private String openDate;

    //지정일자
    @Column
    private String designateDate;

    //지정취소일자
    @Column
    private String cancelRegDate;

    //지정취소사유
    @Column
    private String cancelReason;

    //불가일자
    @Column
    private String unAvailableDate;

    //불가사유
    @Column
    private String unAvailableReason;

    // 추후 enum
    //음식의 유형
    @Column
    private String foodSort;

    //재지정일자
    @Column
    private String reDesignateDate;

    //최종수정일자
    @Column
    private String lastModifiedDate;

    //추후 enum 변경
    //데이터 갱신 구분
    @Column
    private String renewedSort;

    //데이터갱신일자
    @Column
    private String renewedDate;

    //전화번호
    @Column
    //@Embedded
    private String phoneNumber;

    @Builder
    public PostData(Long rowNumber, String openServiceId, String code, String controlNum,
        String shopName, String allowNumber, String streetAddress, String locationAddress, String operationCode,
        String closedDate, String regDate, String openDate, String designateDate, String cancelRegDate, String cancelReason,
        String unAvailableDate, String unAvailableReason, String foodSort, String reDesignateDate, String lastModifiedDate, String renewedSort, String renewedDate,
        String phoneNumber)
    {
        this.rowNumber = rowNumber;
        this.openServiceId = openServiceId;
        this.code = code;
        this.controlNum = controlNum;
        this.shopName = shopName;
        this.allowNumber = allowNumber;
        this.streetAddress = streetAddress;
        this.locationAddress = locationAddress;
        this.operationCode = operationCode;
        this.closedDate = closedDate;
        this.regDate = regDate;
        this.openDate = openDate;
        this.designateDate = designateDate;
        this.cancelRegDate = cancelRegDate;
        this.cancelReason = cancelReason;
        this.unAvailableDate = unAvailableDate;
        this.unAvailableReason = unAvailableReason;
        this.foodSort = foodSort;
        this.reDesignateDate = reDesignateDate;
        this.lastModifiedDate = lastModifiedDate;
        this.renewedSort = renewedSort;
        this.renewedDate = renewedDate;
        this.phoneNumber = phoneNumber;
    }

}
