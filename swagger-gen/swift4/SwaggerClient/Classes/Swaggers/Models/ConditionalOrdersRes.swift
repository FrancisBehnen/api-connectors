//
// ConditionalOrdersRes.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Get order list response */

public struct ConditionalOrdersRes: Codable {

    public var data: [V2ConditionalListRes]?
    public var cursor: String?

    public init(data: [V2ConditionalListRes]?, cursor: String?) {
        self.data = data
        self.cursor = cursor
    }


}

