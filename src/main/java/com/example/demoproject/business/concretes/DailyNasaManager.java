package com.example.demoproject.business.concretes;

import com.example.demoproject.business.abstracts.DailyNasaService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DailyNasaManager implements DailyNasaService {



    @Override
    public List<Object> getDailyNasa() {
        final String uri = "https://api.nasa.gov/planetary/apod?api_key=9AQIlKl22cq7krdMltPsGyhV0bdgdg16kokTzcgE";

        RestTemplate restTemplate = new RestTemplate();
        Object[] temporaryResult = restTemplate.getForObject(uri, Object[].class);
        List<Object> result = Arrays.asList(temporaryResult);
        return result;
    }
}
