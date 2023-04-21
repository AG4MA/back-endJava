

/*in questo caso è stato necessario utilizzare
i models DTO per ovviare all'errore del lazy inazialization*/


package com.example.alessandro.models.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ReportCodeDTO {

        private long id;

        private String identifier;

        private List<String> valore;

        public ReportCodeDTO(long id, String identifier, List<String> valore){
            this.identifier = identifier;
            this.valore = valore;
        }


}

