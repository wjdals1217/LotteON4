package kr.co.lotteon.dto.cs;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data

public class PageResponseDTO {


    private List<CsArticleNoticeDTO> dtoList;
    private int pg;
    private int size;
    private int total;
    private String cate1;
    private String cate2;
    private String useyn="Y";

    private int start, end;
    private boolean prev,next;

    @Builder
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<CsArticleNoticeDTO> dtoList1, int total){
        this.cate1= pageRequestDTO.getCate1();
        this.cate2= pageRequestDTO.getCate2();
        this.pg=pageRequestDTO.getPg();
        this.size= pageRequestDTO.getSize();
        this.total =total;
        this.dtoList=dtoList1;


        this.end= (int) (Math.ceil(this.pg/10.0))*10;
        this.start=this.end-9;
        int last= (int)(Math.ceil(total/(double)size));

        this.end= end > last ? last:end;
        this.prev = this.start>1;
        this.next=total > this.end* this.size;

    }




}
