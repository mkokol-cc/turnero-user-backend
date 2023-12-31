package com.sistema.examenes.modelo.usuario.pagos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewPreferenceDTO implements Serializable {
    private String accessToken;
    private List<PreferenceItem> items;

}
