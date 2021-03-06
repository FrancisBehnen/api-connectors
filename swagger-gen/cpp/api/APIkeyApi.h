/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.8.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * APIkeyApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_APIkeyApi_H_
#define IO_SWAGGER_CLIENT_API_APIkeyApi_H_


#include "../ApiClient.h"

#include "Object.h"

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  APIkeyApi
{
public:
    APIkeyApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~APIkeyApi();
    /// <summary>
    /// Get account api-key information.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<std::shared_ptr<Object>> aPIkey_info(
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_APIkeyApi_H_ */

