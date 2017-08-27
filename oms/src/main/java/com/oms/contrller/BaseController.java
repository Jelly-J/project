package com.oms.contrller;

import com.oms.common.ClientRequest;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by Jelly on 2017/8/27.
 */
@Slf4j
public abstract class BaseController {

    protected final ObjectMapper mapper;
    protected final String templateFilePath = "WEB-INF/systemdata/";

    public BaseController() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    }

    protected <T> T parseOmniRequestData(ClientRequest<T> req, Class<T> clazz) {
        String json = null;
        T pojo = null;
        try {
            json = mapper.writeValueAsString(req.getData());
            pojo = mapper.readValue(json, clazz);
        } catch (Exception e) {
            log.error("json parse error :" + e.getMessage(), e);
            return null;
        }
        if (json == null) {
            log.error("json string is null. clazz=" + clazz.getSimpleName());
            return null;
        }

        if (pojo == null) {
            log.info("json String:" + json);
            log.error("pojo is null." + clazz.getSimpleName());
            return null;
        }
        return pojo;
    }

    protected void traceGetIntoMethod(String methodName) {
        log.info("Get into " + methodName);
    }

    protected void traceGetOffFromMethod(String methodName) {
        log.info("Get off from " + methodName);
    }
}
